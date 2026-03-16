import pandas as pd

def rearrange_products_table(products: pd.DataFrame) -> pd.DataFrame:
    import pandas as pd

def rearrange_products_table(products: pd.DataFrame) -> pd.DataFrame:
    # 1. Unpivot the DataFrame using melt
    melted_df = pd.melt(
        products, 
        id_vars=['product_id'], 
        value_vars=['store1', 'store2', 'store3'], 
        var_name='store', 
        value_name='price'
    )
    
    # 2. Drop the rows where the price is NaN (null)
    return melted_df.dropna(subset=['price'])