import pandas as pd

def invalid_tweets(tweets: pd.DataFrame) -> pd.DataFrame:
   # 1. Access the 'content' column
    # 2. Use .str.len() to find lengths of all tweets at once
    # 3. Filter for lengths strictly greater than 15
    invalid_mask = tweets['content'].str.len() > 15
    
    # Return only the 'tweet_id' of those rows
    return tweets[invalid_mask][['tweet_id']]