import {Product} from "~/utils/types";

export default defineEventHandler((event) => {
    const products: Product[] = [
        {
            id: 1,
            slug: "kaffeebohnen-rustico",
            name: "Kaffeebohnen Rustico",
            price: 37,
            description: "lorem ipsum bla bla bla",
            category: "kaffeebohnen"
        },
        {
            id: 2,
            slug: "kaffeebohnen-intenso",
            name: "Kaffeebohnen Intenso",
            price: 48,
            description: "lorem ipsum bla bla bla",
            category: "kaffeebohnen"
        },
        {
            id: 3,
            slug: "kaffeefilter",
            name: "Kaffeefilter",
            price: 107.70,
            description: "lorem ipsum bla bla bla",
            category: "kaffeezubehör"
        },
    ];

    return products

})