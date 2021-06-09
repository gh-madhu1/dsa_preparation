class ReverseArray:
    
    def _reverseArray(self, arr, start, end):
        while(start < end):
            temp = arr[start]
            arr[start] = arr[end]
            arr[end] = temp
            start += 1
            end -= 1

    def _leftRotate(self, arr, d):
        if d == 0:
            return
        n = len(arr)
        self._reverseArray(arr, 0, d-1)
        self._reverseArray(arr, d, n-1)
        self._reverseArray(arr, 0, n-1)
        print(arr)

test = ReverseArray()
tArr = [1,2,3,4,5,6]
test._leftRotate(tArr, 2)
            
        
   
    
    
