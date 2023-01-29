x = ("aku","dia","kamu")
y = [1,2,3,4,5]
z = {"budi":20,"nanan":70,"toto":40}

#menampilkan dictionary
for key,value in z.items():
    print(key + ":" + str(value))
 
b = 123456677
#menampilkan angka secara bersusun b+str karena b merupakan int
for i in str(b):
    print(i)
    
#menampilkan angka sampai yang ditentukan
for i in range (7):
    print(i)
    
#menampilkan hallo sebanyak 20 kali
for i in range(20):
    print("hallo")
    
#menampilkan angka 20-50 dengan kelipatan 2
for i in range(20,50,2):
    print(i)