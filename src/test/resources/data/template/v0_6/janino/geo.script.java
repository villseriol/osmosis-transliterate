switch (ctx.getCurrentTag()) {
    case "ref":
    case "addr:city":
    case "addr:province":
    case "addr:block_number":
    case "addr:neighbourhood":
    case "addr:postcode":
    case "addr:housenumber":
    case "addr:quarter":
    case "addr:full":
    case "addr:suburb":
    case "addr:country":
    case "addr:street":
    case "addr:county":
    case "addr:housename":
    case "addr:floor":
    case "addr:place":
    case "addr:flats":
    case "addr:room":
    case "addr:prefecture":
    case "addr:unit":
    case "addr:block":
    case "addr:district":
    case "addr:all":
    case "addr:state":
    case "addr:pref":
    case "addr:hamlet":
    case "addr:region":
    case "addr:neighborhood":
    case "addr:subdistrict":
    case "addr:town":
        return true;

    default:
        return false;
}
