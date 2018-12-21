print("begin")
i=1
while i<=5:
    print("welcome",i)
    i=i+1
print("end")

print("begin")
sum=0;
j=1
while (j<=100):
    sum=sum+j
    j=j+1
print(sum)
print("end")


print("begin")
i=1
while i<=5:
    print("welcome",i)
    if i==3:
        break
    i=i+1
else:
    print("while else")
    print("end")
