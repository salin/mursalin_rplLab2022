identitas = { 
    "nama" : "masri", 
    "umur" : 19, 
    "alamat" : "sendana"} 
identitas2 = { "jurusan" : "Informatika",
 "kelas" : "C", 
 "hobbi" : "bola"}


print("identitas : ", identitas) 
print() 
print("identitas2 : ", identitas2) 
print()
hasil = dict(identitas, **identitas2) 
print("setelah di gabung : ", hasil) 
print() 

print(hasil.keys()) 
print() 
print(hasil.values())