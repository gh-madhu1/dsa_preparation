arr = [2,3,5,8,1,8,0,9,11, 23, 51]
num = 0

def searchElement(arr, num):
    n = len(arr)
    for i in range(n):
        if arr[i] == num:
            print("From if block")
            return i
        elif arr[n-1] == num:
            print("From else if block")
            return n-1
        n-=1
print(searchElement(arr, num))
