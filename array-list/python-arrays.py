# There are four collection data types in the Python programming language:

# 1. List is a collection which is ordered and changeable. Allows duplicate members.
# 2. Tuple is a collection which is ordered and unchangeable. Allows duplicate members.
# 3. Set is a collection which is unordered, unchangeable*, and unindexed. No duplicate members.
# 4. Dictionary is a collection which is ordered** and changeable. No duplicate members.
names = []

names.append("Rojali")
names.append("Eko")

print(names[0])
print(len(names))

names.remove(names[0])
print(names)

names.clear()

print(len(names))
