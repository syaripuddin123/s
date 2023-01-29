while True:
    operasi = input("silahkan tuliskan pengoperasian yang anda ingin pilih, misalnya +,-,/,*:" )
    if operasi not in("+", "-", "/", "*"):
        print("maaf operasi yang anda masukkan salah")
        break
        
    x = int(input("masukkan angka pertama :"))
    y = int(input("masukkan angka kedua :"))

    if operasi == "+":
        print("hasil dari",x,"+",y,"=",x+y)
    elif operasi == "-":
        print("hasil dari",x,"-",y,"=",x-y)
    elif operasi == "/":
        print("hasil dari",x,"/",y,"=",x/y)
    elif operasi == "*":
        print("hasil dari",x,"*",y,"=",x*y)
