def popularFriend():
    """"Finds the most popular friend from given input"""

    A="A";B="B";C="C";D="D";E="E";F="F";G="G";H="H";I="I";J="J" #Just assigning so variable names and characters don't CONFLICT with each other

    dict=[] #List of dictionaries
    dict.append({"B":1,"C":1,"D":5,"E":5,"F":2,"G":3,"H":5,"I":2,"J":4,"A":0}) #A_friends
    dict.append({"A":1,"C":2,"D":5,"E":3,"F":2,"G":3,"H":5,"I":2,"J":2,"B":0}) #B_friends
    dict.append({"B":1,"A":1,"D":5,"E":1,"F":2,"G":3,"H":1,"I":2,"J":1,"C":0}) #C_friends
    dict.append({"B":5,"C":5,"A":5,"E":5,"F":5,"G":5,"H":5,"I":5,"J":5,"D":0}) #D_friends
    dict.append({"B":1,"C":2,"D":5,"A":5,"F":4,"G":1,"H":5,"I":2,"J":4,"E":0}) #E_friends
    dict.append({"B":1,"C":1,"D":5,"E":5,"A":2,"G":3,"H":5,"I":2,"J":4,"F":0}) #F_friends
    dict.append({"B":5,"C":4,"D":5,"E":3,"F":2,"A":1,"H":5,"I":4,"J":5,"G":0}) #G_friends
    dict.append({"B":1,"C":2,"D":5,"A":5,"F":4,"G":1,"E":5,"I":2,"J":4,"H":0}) #H_friends
    dict.append({"B":1,"C":5,"D":5,"A":5,"F":4,"G":5,"E":5,"H":2,"J":5,"I":0}) #I_friends
    dict.append({"B":4,"C":4,"D":5,"A":5,"F":4,"G":4,"E":5,"I":4,"H":4,"J":0}) #J_friends

    popularCount={} #dict to store the count of scores of each friend

    
    i=0;count=0;

    ascii=ord(A) #iterating through the alphabets A-J 
    while(ascii<=ord(J)):
        count=0;i=0
        while(i<len(dict)): #iterating through the dictionaries
            count=count+dict[i][chr(ascii)]
            i=i+1

        popularCount[chr(ascii)]=count
        ascii=ascii+1


    print(popularCount) #printing the dictionary containing the count of scores

    max_value=0 

    #To find the maximum score from the dictionary
    for key in popularCount.keys():
        if(popularCount[key]>max_value):
            max_value=popularCount[key]
            max_key=key
    

    print("The most popular student is ",max_key," with a score of ",max_value)


popularFriend()