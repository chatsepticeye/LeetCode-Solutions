import pandas as pd

def students_and_examinations(students: pd.DataFrame, subjects: pd.DataFrame, examinations: pd.DataFrame) -> pd.DataFrame:
    
    # 1. Combine every student with every subject (Cross Merge)
    master_list = pd.merge(students, subjects, how='cross')
    
    # 2. Use your groupby to count the actual tests taken
    # We group by both columns, count them with .size(), and name the new column
    actual_counts = examinations.groupby(['student_id', 'subject_name']).size().reset_index(name='attended_exams')
    
    # 3. Attach the counts to our master list (Left Merge)
    result = pd.merge(master_list, actual_counts, on=['student_id', 'subject_name'], how='left')
    
    # 4. Fill the missing values with 0 and sort it the way LeetCode wants
    result['attended_exams'] = result['attended_exams'].fillna(0)
    result = result.sort_values(by=['student_id', 'subject_name'])
    
    # Return the columns in the exact requested order
    return result[['student_id', 'student_name', 'subject_name', 'attended_exams']]