total = int(input('masukan jumlah semen : '))
total1 = total * 60000
setelah_diskon = total
setelah_diskon = total1 - total 

if total >= 100:
    diskon = total * (2/100)
    print ("Anda Dikenakan Diskon 2%",(setelah_diskon))
elif total >= 200:
    diskon = total * (5/100)
    print ("Anda Dikenakan Diskon 5%",(setelah_diskon))
else :
    print ("tidak ada diskon",(total1))

