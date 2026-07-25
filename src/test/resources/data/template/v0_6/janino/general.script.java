switch (ctx.getCurrentTag()) {
    case "operator":
    case "tunnel:name":
    case "bridge:name":
    case "name":
    case "name:en":
    case "name:ja":
    case "name:ja-Hira":
    case "alt_name":
    case "brand:ja":
    case "brand":
        return true;

    default:
        return false;
}
