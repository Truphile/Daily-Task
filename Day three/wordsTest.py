import unittest
from swords import *

class TestWords(unittest.TestCase):
   

    def test_normal_sentence(self):
        sentence = "i love programming"
        expected = ['i', 'love', 'programming']
        self.assertEqual(split_words(sentence), expected)


    def test_multiple_spaces(self):
        sentence = "  leading space and  multiple   spaces  "
        expected = ['leading', 'space', 'and', 'multiple', 'spaces']
        self.assertEqual(split_words(sentence), expected)


    def test_empty_string(self):
        sentence = ""
        expected = []
        self.assertEqual(split_words(sentence), expected)


    def test_for_no_spaces_in_sentence(self):
        sentence = "singleword"
        expected = ['singleword']
        self.assertEqual(split_words(sentence), expected)

   