#membuat kalkulator sederhana
while True:
    operasi = input("silahkan tuliskan pengoperasian yang anda ingin pilih, misalnya +,-,/,*:" )
    if operasi not in("+", "-", "/", "*"):
        print("maaf operasi yang anda masukkan salah")
        
    x = int(input("masukkan angka pertama :"))
    y = int(input("masukkan angka kedua :"))

    if operasi == "+":
        print(x + y)
    elif operasi == "-":
        print(x - y)
    elif operasi == "/":
        print(x / y)
    elif operasi == "*":
        print(x * y)