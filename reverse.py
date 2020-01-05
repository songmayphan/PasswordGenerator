# for password
def main():
	print("Enter string to reverse: >> ")
	str = input()
	print(str[::-1])
	print("Continue?>>y/n")
	answer = input()
	if answer == 'y':
		main()
	else:
		exit()
main()
