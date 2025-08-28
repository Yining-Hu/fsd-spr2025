def flatten(original):
    flattened = []
    for ele in original:
        if type(ele)==int:
            flattened.append(ele)
        else:
            # extend the list
            flattened = flattened + flatten(ele)
        print(flattened)
    return flattened

ip = [1,2,[3,4,5],[[6,7,8],[9,[0]]]]

print(flatten(ip))