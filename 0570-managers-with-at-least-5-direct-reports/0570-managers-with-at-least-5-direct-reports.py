import pandas as pd

def find_managers(employee: pd.DataFrame) -> pd.DataFrame:
    # 1. Group by managerId and count how many employees report to each one
    # .dropna() ensures we don't accidentally count the big bosses who have no manager (null)
    report_counts = employee.groupby('managerId').size().reset_index(name='count')
    
    # 2. Filter that list to only keep the managers with 5 or more reports
    big_managers = report_counts[report_counts['count'] >= 5]
    
    # 3. Grab just the ID numbers of those big managers
    vip_ids = big_managers['managerId']
    
    # 4. Go back to the main table and filter for those specific IDs
    result = employee[employee['id'].isin(vip_ids)]
    
    # 5. Return only the 'name' column as requested
    return result[['name']]