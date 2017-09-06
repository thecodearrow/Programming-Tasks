import re

def filesCommentsCheck():
    """To remove comments from a given input python file"""
    input_file=input("Please enter the input file:")
    #Checking for IOError
    try:
        f1 = open(input_file, 'r')
    except IOError:
        print ("Could not read file!")
        sys.exit()

    output_file=input("Please enter the output file name:")
    f2=open(output_file,'w') 

    #Removing comments...
    for line in f1:
            line = re.sub("#.*$", '', line)
            f2.write(line)



    f1.close()
    f2.close()
    print("File successfully generated as -> ",output_file)



filesCommentsCheck()

