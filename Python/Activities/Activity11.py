fruit_Shop = {
    "apple":10,
    "banana":20,
    "papaya":40
}

available_Fruits=input("Which fruits you are looking for:").lower()
if(available_Fruits in fruit_Shop):
    print("Yes,this is available")
else:
    print("No,this is not available")