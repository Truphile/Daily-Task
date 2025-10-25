import random

def get_petals(first_pick,second_pick):
	if type(first_pick) == int and type(second_pick) == int:
		if first_pick >= 0 and second_pick >= 0:
			if first_pick % 2 == 0 and second_pick % 2 != 0:
				return True
			if first_pick % 2 != 0 and second_pick % 2 == 0:
				return True
			else:
				return False	
		else:
			return "Invalid input!"
	else:
		return "Invalid input!"
	


first_pick = input("Enter the number of petals: ")
second_pick = input("Enter the number of petals on second flower: ")
if first_pick.isdigit() and second_pick.isdigit():
	print(get_petals(int(first_pick),int(second_pick)))
else:
	print(get_petals(first_pick,second_pick))