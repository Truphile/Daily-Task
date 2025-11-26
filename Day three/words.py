words = "i love programming"

def split_words(words):
    new_word = []
    single_word = ""

    for char in words:
        if char == " ":
            
            new_word.append(single_word)
          
            single_word = ""
        else:
            single_word += char
            
    new_word.append(single_word)
    return new_word

print(split_words (words))
