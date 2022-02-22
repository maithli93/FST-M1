player1= input("First player name: ")
player2= input("Second player name: ")

player1_ans= input(player1+ " do you want to choose rock,paper,scissors? ").lower()
player2_ans= input(player2+ " do you want to choose rock,paper,scissors? ").lower()

if player1_ans==player2_ans:
    print("Tie!")
elif player1_ans== 'paper':
    if player2_ans=='rock':
        print("Paper wins!")   
    else:
        print("Rock wins")
elif player1_ans=='scissors':
    if player2_ans=='rock':
        print("Scissors wins!")
    else:
        print(" Rock wins")
elif player1_ans=='scissors':
     if player2_ans=='paper':
         print("Scissors wins")
     else:
         print("Paper wins")
else:
    print("You have entered invalid input..Please try again!")
         



