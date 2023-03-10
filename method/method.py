# karena python bahasa interpreter maka code berjalan secara line-by-line sehingga function harus didefinisikan diatas
def printHello(name, age):
    print("Hello I'm " + name)
    print(f"I'm {age} years old.")

def isAgeExist(arr, find):
    for i in arr:
        if i == find:
            return True
    return False

ages = [19, 20, 25]
name = "john"
age = 25

printHello(name, age)
print(isAgeExist(ages, age))
