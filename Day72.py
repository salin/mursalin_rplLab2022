total = int(input('masukan jumlah semen : '))
setelah_diskon = total
total1 = total * 60000
 
if total >= 100:
    diskon = total * (2/100)
elif total >= 200:
    diskon = total * (5/100)
else:
    print("tidak ada diskon")
    
setelah_diskon = total1 - total 
print("Diskonya yaitu: ",(diskon))
print ("diskonnya adalah",(setelah_diskon))
