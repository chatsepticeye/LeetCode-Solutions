import pandas as pd

def total_time(employees: pd.DataFrame) -> pd.DataFrame:
    employees['total_time']=employees['out_time']-employees['in_time']
    
    
    # 2. Chain the formatting, grouping, and summing together
    return employees.rename(columns={'event_day': 'day'}) \
                    .groupby(['day', 'emp_id'], as_index=False) \
                    .agg({'total_time': 'sum'})