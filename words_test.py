import unittest
from words import *

class BreakfastTest(unittest.TestCase):
	def test_that_get_words_exist(self):
		actual = get_words("semicolon")
		expected = "SEMICOLON"
		self.assertEqual(actual,expected)
	
	def test_that_get_words_only_takes_in_string(self):
		actual = get_words("126734")
		expected = "Invalid input!"
		self.assertEqual(actual,expected)