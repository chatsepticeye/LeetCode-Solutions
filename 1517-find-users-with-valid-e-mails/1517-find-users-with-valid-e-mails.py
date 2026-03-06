import pandas as pd

def valid_emails(users: pd.DataFrame) -> pd.DataFrame:
    # Define our regex pattern
    pattern = r'^[a-zA-Z][a-zA-Z0-9_.-]*@leetcode\.com$'
    
    # .str.match() checks if the string matches the regex pattern
    # We pass that boolean mask back into the dataframe to filter it
    valid_users = users[users['mail'].str.match(pattern)]
    
    return valid_users
   