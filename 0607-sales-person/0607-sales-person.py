import pandas as pd

def sales_person(sales_person: pd.DataFrame, company: pd.DataFrame, orders: pd.DataFrame) -> pd.DataFrame:
    red_com_id = company[company['name'] == 'RED']['com_id']
    blacklisted_sales_ids = orders[orders['com_id'].isin(red_com_id)]['sales_id']
    clean_sales_team = sales_person[~sales_person['sales_id'].isin(blacklisted_sales_ids)]
    return clean_sales_team[['name']]