class Parent:
	def __init__(self, name):
		print("Parent Object Created")
		self.testFunc(name)
	def testFunc(self, name):
		print("Parent testFunc called {}", name)

class Child(Parent):
	def __init__(self, name):
		print("Child Object Created")
		self.testFunc(name)
	# def testFunc(self, name):
	# 	print("Child testFunc called {}", name)

class oopsConcepts:
	def __init__(self):
		print("Main class Object Created")
		parentObj = Child("with Oops Concepts")

mainObj = oopsConcepts()