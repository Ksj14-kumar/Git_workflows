
describe("Simple test case", ()=>{
    it("Simple test case", async()=>{
        expect(12).toBe(12);
    });
    it("should be return true if it is true", async()=>{
        expect(true).toBeTruthy();
    });
    it("should be return false it is false", async()=>{
        expect(false).toBeFalsy();
    });
});