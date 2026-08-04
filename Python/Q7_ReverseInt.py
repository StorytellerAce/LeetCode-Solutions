def reverse(self, x):
    int_min = -(2 ** 31)
    int_max = 2 ** 31 - 1

    sign = -1 if x < 0 else 1
    
    reverse = int(str(abs(x))[::-1]) * sign
    
    if reverse > int_max or reverse < int_min:
        return 0
    return reverse
        