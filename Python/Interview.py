#Interview with tencent backend. Q: Bubblesort algorithm implementation in python

question = [2, 4, 1, 5, 6, 7, 9, 3, 0, 8]

for i in range (len(question) - 1):
    swapped = False
    for j in range(len(question) - i - 1):
        if (question[j] > question[j + 1]):
            temp = question[j]
            question[j] = question[j+1]
            question[j+1] = temp
            swapped = True
    if swapped == False: #all sorted already
        break

print(question)
    