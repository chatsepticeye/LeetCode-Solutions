import pandas as pd

def article_views(views: pd.DataFrame) -> pd.DataFrame:
    own_views = views[views['author_id'] == views['viewer_id']]
    
    # Extract unique author_ids
    unique_authors = own_views[['author_id']].drop_duplicates()
    
    # Rename 'author_id' to 'id' to match the required output format
    result = unique_authors.rename(columns={'author_id': 'id'})
    
    # Sort the dataframe by 'id' in ascending order
    result = result.sort_values(by='id', ascending=True)
    
    return result