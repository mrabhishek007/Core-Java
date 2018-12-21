import webbrowser
import time
total_break =3
count=0
print("Program is started on "+time.ctime())
while(count < total_break):
 time.sleep(10)
 webbrowser.open("https://www.youtube.com/watch?v=E9OFaR2DSOI")
 count=count+1
