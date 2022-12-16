u  = [ 0 , 0 , - 1 ]
v  = [ 1 , 1 , 1 ]
udottv  = []
untuk  saya  dalam  rentang ( 3 ):
    hasil  =  u [ i ] *  v [ i ]
    udotv . tambahkan ( hasil )

sudut  =  jumlah ( udotv )
jika ( sudut  <  0 ):
    print ( "u dan v membentuk sudut tumpul" )
lain :
    jika ( sudut  >  0 ):
        print ( "u dan v membentuk sudut lancip" )
    lain :
        print ( "u dan v membentuk sudut orthogonal" )
