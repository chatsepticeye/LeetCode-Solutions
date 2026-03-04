import pandas as pd
import numpy as np

def calculate_special_bonus(employees: pd.DataFrame) -> pd.DataFrame:
    # Notice the '~' added before the string condition
    employees['bonus'] = np.where(
        (employees['employee_id'] % 2 != 0) & (~employees['name'].str.startswith('M')), 
        employees['salary'], 
        0
    )
    
    # Return just the required columns, sorted by employee_id
    return employees[['employee_id', 'bonus']].sort_values(by='employee_id')