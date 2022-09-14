def contagiosCovis(semanasTotales, arrInfectados=[], numSemana=0, contagiosT=1):
    if numSemana >= 2:
        contagiosT -= arrInfectados[-2]
    if semanasTotales == numSemana:
        return contagiosT
    arrInfectados.append(contagiosT)
    return contagiosCovis(semanasTotales, arrInfectados, numSemana+1, contagiosT*3)


print(contagiosCovis(4))
