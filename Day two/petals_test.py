import unittest

from petals import *

class TestLove(unittest.TestCase):
	def test_get_petals_exist(self):
		actual = get_petals(3,4)
		expected = True
		self.assertEqual(actual,expected)
		actual = get_petals(2,6)
		expected = False
		self.assertEqual(actual,expected)

	def test_that_get_petals_take_positive_numbers_alone(self):
		actual = get_petals(-7,4)
		expected = "Invalid input!"
		self.assertEqual(actual,expected)
		actual = get_petals(9,-5)
		expected = "Invalid input!"
		self.assertEqual(actual,expected)


