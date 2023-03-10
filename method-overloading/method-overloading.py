def sumFunction(a: int, b: int):
    return a + b


def sumFunction(nums: list):
    result = 0
    for n in nums:
        result += n
    return result


def sumFunction(nums: str):
    result = ""
    for n in nums:
        result += n
    return result

# method overloading tidak berlaku di python
# sebab fungsi akan terdefenisi sebagai fungsi yang didefinisikan terakhir


try:
    print(sumFunction(3, 9))
except Exception as e:
    print(e)
finally:
    print(sumFunction("hello world!"))
