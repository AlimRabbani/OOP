#nama : Mamnun Aulia S 
#NIM : D0221342 
#KELAS : INFORMATIKA F 

#menghitung luas persegi panjang 
print("MENGHITuNG LUAS PERSEGI")
panjang = int(input(' panjang PERSEGI= ')) 
lebar = int(input(' lebar PERSEGI = ')) 
tinggi = int(input('tinggi PERSEGI = '))

def luas_segitiga(): 
    luas = panjang * lebar * tinggi/2 
    print('jadi luas segitiganya = ', luas)

luas_segitiga() 

#menghitung luas lingkaran   
print("MENGHITUNG LUAS LINGKARAN ") 
pi = int(input(' nilai Pi = ')) 
jariJari1 = int(input(' nilai jari - jari 1 = ')) 
jariJari2 = int(input(' jari - jari2 = ')) 


def luas_lingkaran (): 
    luas1 = pi * jariJari1 * jariJari2 / 2 
    print('jadi luas lingkarannya = ' , luas1) 
luas_lingkaran() 

#menghitung luas segitiga  
print("MENGHITUNG LUAS SEGITIGA ") 
panjang = int(input('panjang segitiga   = ')) 
lebar = int(input('lebar segitiga   = ')) 
tinggi = int(input('tinggi segitiga  = ')) 


def luas_segitiga (): 
    luas = panjang * lebar * tinggi / 2 
    print('luas segitiganya adalah = ' , luas ) 
luas_segitiga()
