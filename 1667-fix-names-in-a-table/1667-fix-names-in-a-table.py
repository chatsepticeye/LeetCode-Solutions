import pandas as pd

def fix_names(users: pd.DataFrame) -> pd.DataFrame:
    # .str.capitalize() makes the first letter uppercase and the rest lowercase
    users['name'] = users['name'].str.capitalize()
    
    # Sort the DataFrame by user_id
    users = users.sort_values(by='user_id')
    
    return users