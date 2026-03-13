import pandas as pd

def categorize_products(activities: pd.DataFrame) -> pd.DataFrame:
    # Step 1: Drop exact duplicate rows so we only count unique daily sales
    df = activities.drop_duplicates()
    
    # Step 2: Sort alphabetically by product so they join in the right order later
    df = df.sort_values(by=['sell_date', 'product'])
    
    # Step 3: Group by the date and apply our two custom rules
    result = df.groupby('sell_date').agg(
        num_sold=('product', 'count'),
        products=('product', lambda x: ','.join(x))
    ).reset_index()
    
    return result