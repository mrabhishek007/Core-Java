print("begin")
i=0;
while i<=5:
    i=i+1
    if i==3:
        
        continue
    print("welcome",i)
    
print("end")


print("begin")
while True:
    name=input("enter username")
    if name!='sathya':
        continue
    password=input("enter password")
    if password!='lokesh':
        break
    print("Access Granted")
