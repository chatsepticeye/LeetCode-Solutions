import pandas as pd

def nth_highest_salary(employee: pd.DataFrame, N: int) -> pd.DataFrame:
    unique_sal = employee['salary'].drop_duplicates().sort_values(ascending=False)
    
    # We added 'N > 0' to prevent negative indexing!
    if N > 0 and len(unique_sal) >= N:
        nth_sal = unique_sal.iloc[N-1]
    else:
        nth_sal = None
        
    # Make sure to use 'nth_sal' here to match the variable above
    return pd.DataFrame({f'getNthHighestSalary({N})': [nth_sal]})