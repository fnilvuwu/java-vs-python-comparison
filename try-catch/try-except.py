try:
    result = 10 / 0
except Exception as e:
    # repr:representasi function/method yang error beserta messagenya
    print(repr(e))
    # hanya print error message saja
    print(e)
finally:
    print("end")
