import pandas as pd

def daily_leads_and_partners(daily_sales: pd.DataFrame) -> pd.DataFrame:
    groups=daily_sales.groupby( ['date_id','make_name'])[['lead_id','partner_id']]
    counts=groups.nunique()
    
    new = counts.rename(columns={'lead_id': 'unique_leads', 'partner_id': 'unique_partners'})
    return new.reset_index()