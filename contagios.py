

# Contagios covis

def calcularContagiosCovis(semanas):
    if semanas == 1:
        return 3
    return 3*calcularContagiosCovis(semanas-1)


print("Total de contagiados: ", calcularContagiosCovis(103))


def votaciones(dias):
    if dias == 1:
        return 4
    return 4*votaciones(dias-1)


print("Total de votos: ", votaciones(5))
