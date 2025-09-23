import unittest
import maths as ms
class Test_Maths(unittest.TestCase):
    def test_div(self):
        self.assertEqual(ms.div(4,2),2)

    def test_login(self):
        self.assertEqual(ms.login("superuser"), True)

    def test_factorial(self):
        self.assertEqual(ms.factorial(3),6)