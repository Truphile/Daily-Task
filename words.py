def get_words(words):
	if words.isdigit():
		return"Invalid input!"

	return words.upper()

sentence = input("Enter a sentence: ")
print(get_words(words))