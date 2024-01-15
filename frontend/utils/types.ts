export interface Product {
    id: number,
    slug: string,
    name: string
    price: number,
    description: string,
    category: "kaffeebohnen" | "kaffeezubehör",
}