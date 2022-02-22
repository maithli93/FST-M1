firstList=[10,13,23,40]
secList=[20,25,60,75]

print("First List: ",firstList)
print("Second List: ",secList)

thirdList = []

for num in firstList:
    if(num%2!=0):
        thirdList.append(num)

for num in secList:
    if(num%2==0):
        thirdList.append(num)
print("Result List is: ",thirdList)