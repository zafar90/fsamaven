def calculate_shipping_cost_usa(weight):
    if weight <= 5:
        return 10
    elif weight <= 20:
        return 20
    else:
        return 50

def calculate_shipping_cost_canada(weight):
    if weight <= 5:
        return 12
    elif weight <= 20:
        return 25
    else:
        return 60
