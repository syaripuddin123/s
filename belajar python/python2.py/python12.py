instruksi = input("tekan enter dan isi biodata anda")
nama = input("masukkan nama anda :")
umur = int(input("masukkan umur anda :"))
pendidikan_terakhir = input("masukkan pendidikan terakhir anda :")
pengalaman_kerja = int(input("masukkan pengalaman kerja anda :"))


if umur >= 20 and umur <= 35:
    if pendidikan_terakhir == "s1" or pendidikan_terakhir == "s2" or pendidikan_terakhir == "s3":
        if pengalaman_kerja >= 2:
            print("selamat anda diterima di perusahaan kami")
else:
    print("mohon maaf anda tidak lolos")
        